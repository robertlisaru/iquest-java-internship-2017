package com.iquestint.ju;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class MyListTest {

    private List<String> list;
    private List<String> list2;

    private Class<StringListOperationException> exceptionType = StringListOperationException.class;

    private String[] initData = {"12", "23", "34", "45"};

    @Rule
    public ExpectedException exception = ExpectedException.none();

    @Before
    public void setUp() {
        this.list = new StringList();
        this.list2 = new StringList();
        list2.add("12");
        list2.add("23");
    }

    @Test
    public void testAddValuesToTheList() {
        initData();
        assertEquals(initData.length, list.size());
        for (String data : initData) {
            assertTrue(list.contains(data));
        }
    }

    @Test
    public void testContainsAll() {
        initData();
        assertTrue(list.containsAll(list2));
    }

    private void initData() {
        for (String numberAsString : initData) {
            list.add(numberAsString);
        }
    }

    @Test
    public void testAddNonIntegerValue() {
        exception.expect(exceptionType);
        exception.expectMessage("Invalid number.");

        try {
            list.add("Hey, I'm not an integer.");
        } catch (StringListOperationException e) {
            assertEquals(StringListErrorCode.INVALID_NUMBER_FORMAT, e.getErrorCode());
            assertEquals(102, e.getErrorCode().getErrorNumber());
            throw e;
        }
    }

    @Test
    public void testAddNullValue() {
        exception.expect(exceptionType);
        exception.expectMessage("Null");
        try {
            list.add(null);
        } catch (StringListOperationException e) {
            assertEquals(StringListErrorCode.NULL_ELEMENT, e.getErrorCode());
            assertEquals(101, e.getErrorCode().getErrorNumber());
            throw e;
        }
    }

    @Test
    public void testIndexOutOfBounds() {
        initData();
        exception.expect(exceptionType);
        exception.expectMessage("Index out of bounds.");
        try {
            list.get(initData.length);
        } catch (StringListOperationException e) {
            assertEquals(StringListErrorCode.INDEX_OUT_OF_BOUNDS, e.getErrorCode());
            assertEquals(103, e.getErrorCode().getErrorNumber());
            throw e;
        }
    }
}
