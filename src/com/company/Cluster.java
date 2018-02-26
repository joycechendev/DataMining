package com.company;

import java.util.ArrayList;

public class Cluster {
    public ArrayList<Point2D> pointList;
    public Point2D centroid;

    public Cluster() {
        pointList = new ArrayList<>();
        centroid = new Point2D();
    }
    public double getDistPoints(Point2D pt1, Point2D pt2) {
        return Math.sqrt(Math.pow(pt1.x - pt2.x, 2)
                + Math.pow(pt1.y - pt2.y, 2));
    }


    // get the centroid of a cluster
    public Point2D getCentroid() {
        return this.centroid;
    }

    public void calculateCentroid() {
        double meanX = 0;
        double meanY = 0;
        for(int i = 0; i < pointList.size(); i++) {
            meanX += pointList.get(i).x;
            meanY += pointList.get(i).y;
        }
        meanX /= pointList.size();
        meanY /= pointList.size();
        this.centroid = new Point2D(0, meanX, meanY);
    }

    public void addPoint2D(Point2D pt) {
        pointList.add(pt);
    }

    public void removePoint2D(Point2D pt) {
        pointList.remove(pt);
    }


}
