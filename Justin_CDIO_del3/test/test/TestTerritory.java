package test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import entity.fieldclasses.*;
import entity.*;

public class TestTerritory {
	
	private Player player;
	private Territory territory1000;
	private Territory territory4000;
	private Territory territoryNegative500;
	Player ejer = new Player("ejer", 5000);
	
	@Before
	public void setUp() throws Exception {
		this.player = new Player("Doland Dak", 10000);
		//Player ejer = new Player("ejer", 1000);
		this.territory1000 = new Territory(1, Color.black, 2000, 1000);
		this.territory4000 = new Territory(2, Color.blue, 6000, 4000);
		this.territoryNegative500 = new Territory(3, Color.yellow, 100, -500);
		this.territory1000.setOwner(ejer);
		this.territory4000.setOwner(ejer);
		this.territoryNegative500.setOwner(ejer);
	}

	@After
	public void tearDown() throws Exception {
		this.player = new Player("Doland Dak", 10000);
	
	}

	@Test
	public void testEntity() {
		Assert.assertNotNull(this.player);
		Assert.assertNotNull(this.territory1000);
		Assert.assertNotNull(this.territory4000);
		Assert.assertNotNull(this.territoryNegative500);
		
		Assert.assertTrue(this.territory1000 instanceof Territory);
		Assert.assertTrue(this.territory4000 instanceof Territory);
		Assert.assertTrue(this.territoryNegative500 instanceof Territory);
	}
	
	@Test
	public final void testGetRent() {
		int expected = 1000;
		int actual = this.territory1000.getRent();
		Assert.assertEquals(expected, actual);
		
	}

	@Test
	public final void testGetPrice() {
		int expected = 2000;
		int actual = this.territory1000.getPrice();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public final void testGetType() {
		int expected = 5;
		int actual = this.territory1000.getType();
		Assert.assertEquals(expected, actual);
	}

	@Test
	public final void testLandOnField1000() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		//Tester LandOnField metoden og om den påvirker balances som forventet.
		this.territory1000.landOnField(this.player);
		
		expected = 10000 - 1000;
		actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		}
	
	@Test
	public final void testLandOnField2000() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		//Tesert udfaldet af LandOnField metoden i Territory og hvordan balancen påvirkes.
		this.territory4000.landOnField(this.player);
		
		expected = 10000 - 4000;
		actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
	}
	
	@Test
	public final void testLandOnFieldNegative500() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		//tester om hvordan rent metoden fungere sammen med player klassen.
		// tester om en spiller modtager penge når han skal betale et negativt beløb - Overholder klassen matematiske regler (-- = +).
		this.territoryNegative500.landOnField(this.player);
		
		expected = 10000 + 500;
		actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		//tester om ejeren af feltet er blevet trukkt penge.
		expected = 5000 - 500;
		actual = ejer.getBalance();
		Assert.assertEquals(expected, actual);	
	}
	
}
