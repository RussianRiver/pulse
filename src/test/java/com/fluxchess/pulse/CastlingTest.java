/*
 * Copyright (C) 2013-2014 Phokham Nonava
 *
 * Use of this source code is governed by the MIT license that can be
 * found in the LICENSE file.
 */
package com.fluxchess.pulse;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

import static com.fluxchess.test.AssertUtil.assertUtilityClassWellDefined;
import static org.junit.Assert.*;

public class CastlingTest {

  @Test
  public void testUtilityClass() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    assertUtilityClassWellDefined(Castling.class);
  }

  @Test
  public void testValues() {
    for (int color : Color.values) {
      for (int castlingType : CastlingType.values) {
        int castling = Castling.valueOf(color, castlingType);

        assertTrue(Castling.isValid(castling));
        assertEquals(castling, Castling.values[castling]);
      }
    }

    assertFalse(Castling.isValid(Castling.NOCASTLING));
  }

}
