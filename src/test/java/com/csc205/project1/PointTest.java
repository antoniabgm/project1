package com.csc205.project1;

import com.scs205.project1.Point;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PointTest {

    // what i asked copilot :
    // can you write a unit test for Point class utilizing junit5.
    // also add multiple test cases for each method to include common edge cases.

    @Test
    void setPoint() {
        // Test normal case
        Point point = new Point(0, 0);
        point.setPoint(5, 5);
        assertEquals(5, point.getX());
        assertEquals(5, point.getY());

        // Test edge case: setting to negative values
        point.setPoint(-5, -5);
        assertEquals(-5, point.getX());
        assertEquals(-5, point.getY());

        // Test edge case: setting to zero
        point.setPoint(0, 0);
        assertEquals(0, point.getX());
        assertEquals(0, point.getY());
    }

    @Test
    void shiftX() {
        // Test normal case
        Point point = new Point(5, 5);
        point.shiftX(1);
        assertEquals(6, point.getX());

        // Test edge case: shifting by negative value
        point.shiftX(-2);
        assertEquals(4, point.getX());

        // Test edge case: shifting by zero
        point.shiftX(0);
        assertEquals(4, point.getX());
    }

    @Test
    void shiftY() {
        // Test normal case
        Point point = new Point(5, 5);
        point.shiftY(1);
        assertEquals(6, point.getY());

        // Test edge case: shifting by negative value
        point.shiftY(-2);
        assertEquals(4, point.getY());

        // Test edge case: shifting by zero
        point.shiftY(0);
        assertEquals(4, point.getY());
    }

    @Test
    void distance() {
        // Test normal case
        Point point1 = new Point(0, 0);
        Point point2 = new Point(3, 4);
        assertEquals(5, point1.distance(point2));

        // Test edge case: distance to itself
        assertEquals(0, point1.distance(point1));

        // Test edge case: distance to a point with negative coordinates
        Point point3 = new Point(-3, -4);
        assertEquals(5, point1.distance(point3));
    }

    @Test
    void rotate() {
        // Test normal case
        Point point = new Point(5, 5);
        point.rotate(Math.PI / 2.0);
        assertEquals(-5, point.getX(), 0.0001);
        assertEquals(5, point.getY(), 0.0001);

        // Test edge case: rotating by 0 radians
        point.setPoint(5, 5);
        point.rotate(0);
        assertEquals(5, point.getX(), 0.0001);
        assertEquals(5, point.getY(), 0.0001);

        // Test edge case: rotating by 2*PI radians (full circle)
        point.setPoint(5, 5);
        point.rotate(2 * Math.PI);
        assertEquals(5, point.getX(), 0.0001);
        assertEquals(5, point.getY(), 0.0001);
    }

    @Test
    void toStringTest() {
        // Test normal case
        Point point = new Point(5, 5);
        assertEquals("Point{x = 5.0, y = 5.0}", point.toString());

        // Test edge case: negative coordinates
        point.setPoint(-5, -5);
        assertEquals("Point{x = -5.0, y = -5.0}", point.toString());

        // Test edge case: zero coordinates
        point.setPoint(0, 0);
        assertEquals("Point{x = 0.0, y = 0.0}", point.toString());
    }
}