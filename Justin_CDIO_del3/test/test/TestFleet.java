package test;

import static org.junit.Assert.*;

import java.awt.Color;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import entity.fieldclasses.*;
import entity.*;

public class TestFleet {
	
	private Player player;
	private Fleet fleet;
	private Player ejer = new Player("ejer", 5000);
	
	@Before
	public void setUp() throws Exception {
		this.player = new Player("Doland Dak", 10000);
		this.fleet = new Fleet(1, Color.black, 2000);
	}

	@After
	public void tearDown() throws Exception {
		this.player = new Player("Doland Dak", 10000);
		this.fleet = new Fleet(1, Color.black, 2000);
		this.player.setFleetsOwned(0);
	}
	
	@Test 
	public void testEntities() {
		Assert.assertNotNull(this.player);
		Assert.assertNotNull(this.fleet);
		
		Assert.assertTrue(this.fleet instanceof Fleet);
	}

//	@Test
//	public final void testGetRent() {
//		fail("Not yet implemented"); //TODO - Er ikke sikker på om denne metode er interresant at teste. 	
//	}
//
//	@Test
//	public final void testGetPrice() {
//		fail("Not yet implemented"); // TODO - Er testet i samtlige andre klasser. 
//	}
//
//	@Test
//	public final void testGetType() {
//		fail("Not yet implemented"); // TODO . Not interesting. 
//	}

	@Test
	public final void testLandOnField1() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		ejer.setFleetsOwned(1);
		this.fleet.setOwner(ejer);
		this.fleet.landOnField(this.player);
		expected = 10000 - 500;
		actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public final void testLandOnFIeld2() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		ejer.setFleetsOwned(2);
		this.fleet.setOwner(ejer);
		this.fleet.landOnField(this.player);
		expected = 10000 - 1000;
		actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public final void testLandOnFIeld3() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		ejer.setFleetsOwned(3);
		this.fleet.setOwner(ejer);
		this.fleet.landOnField(this.player);
		expected = 10000 - 2000;
		actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
	}
	@Test
	public final void testLandOnFIeld4() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		ejer.setFleetsOwned(4);
		this.fleet.setOwner(ejer);
		this.fleet.landOnField(this.player);
		expected = 10000 - 4000;
		actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
	}
	 
	
	@Test
	public final void testBuyField() {
		int expected = 10000;
		int actual = this.player.getBalance();
		Assert.assertEquals(expected, actual);
		
		// Tester om metoden buyField tilføjer en fleet til spilleren.
		this.fleet.buyField(this.player);
		
		Assert.assertTrue(this.player.getFleetsOwned() == 1);
		}
	

//	@Test
//	public final void testFleet() {
//		fail("Not yet implemented"); // TODO - NOT INTERESTING
//	}

}
