package com.polymorphism;
	
	
	
public class Shape {
    protected String shapeName;
    
    public Shape(String shapeName) {
        super();
        this.shapeName = shapeName;
//        calculateArea();
    }
    
    public String getShapeName() {
        return shapeName;
    }



   public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }



   public Double calculateArea(){



       return 0.0;
    }
    }
