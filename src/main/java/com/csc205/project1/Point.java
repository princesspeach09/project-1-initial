package com.csc205.project1;

//Design and implement a class called Point that represents a location
//in the Cartesian plane. Include at (at minimum) the following methods:
//a consturcor that takes x and y coordinatates as double arguments
//setX(double x), set Y(double y), - stand setters getx(), getY() - standard
//getters setPoin(double x, double y) - set the coordinates of the point.
//shiftX(double n), shiftY(double n) - shift a point by a given amount
//along on eo fthe axes. distance (Point p2) - finds the distance to point
//p2. rotate(double angle) - rotates the point by a specified (radinan) angle
//around the oriigin. The formula for rotaion is as follows: x′=xcos(θ)−ysin(θ) y′=xsin(θ)+ycos(θ)
//Include a toString method as well.

public class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point(Point p) {
        this.x = p.x;
        this.y = p.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void shiftX(double n) {
        this.x += n;
    }

    public void shiftY(double n) {
        this.y += n;
    }

    public double distance(Point p) {
        return Math.sqrt(Math.pow(p.x - this.x, 2) + Math.pow(p.y - this.y, 2));
    }

    public double distanceFromOrigin() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public void rotate(double angle) {
        double newX = x * Math.cos(angle) - y * Math.sin(angle);
        double newY = x * Math.sin(angle) + y * Math.cos(angle);
        this.x = newX;
        this.y = newY;
    }

    @Override
    public String toString() {
        return "(" + this.x + ", " + this.y + ")";
    }

    public boolean equal(Point p) {
        return this.x == p.x && this.y == p.y;
    }
}