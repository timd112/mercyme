package com.owaot.overwatch;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class UserTest {
  @Test
  public void testUser(){
    User user = new User();
    assertNull(user.getGamerTag());
    assertNull(user.getRegion());
    assertNull(user.getPlatform());
    assertEquals(0, user.getLevel());
    assertEquals(0, user.getSkillRating());
    assertEquals(0, user.getQuickPlayWins());
    user.toString();
  }
}
