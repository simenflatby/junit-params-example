package com.example.util;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class StringUtilImplTest {

    private StringUtil stringUtil;

    @Before
    public void setUp() {
        stringUtil = new StringUtilImpl();
    }

    @Test
    @Parameters
    public void isBlank(String string, boolean expectedResult) {
        // Arrange
        // Arrangement is done in parametersForIsBlank().

        // Act
        boolean actualResult = stringUtil.isBlank(string);

        // Assert
        Assert.assertEquals(expectedResult, actualResult);
    }

    private Object[] parametersForIsBlank() {
        return new Object[] {
            new Object[] { null, true },
            new Object[] { "", true },
            new Object[] { " ", true },
            new Object[] { "    ", true },
            new Object[] { "\t", true },
            new Object[] { "\r", true },
            new Object[] { "\n", true },
            new Object[] { "\f", true },
            new Object[] { "Hello, JUnitParams!", false },
            new Object[] { "This should return false (test success).", false },
            new Object[] { "This should not return true (test fail).", true }
        };
    }
}