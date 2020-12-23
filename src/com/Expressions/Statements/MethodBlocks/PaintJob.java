package com.Expressions.Statements.MethodBlocks;

public class PaintJob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        //Returns the number of buckets that bob needs to buy before going to work
        
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }
        
        double totalArea = width * height;
        
        int neededBuckets = 1;
        
        if(totalArea <= (areaPerBucket * extraBuckets) * neededBuckets){
            return extraBuckets;
        }else{
            
            while(totalArea > (areaPerBucket * (extraBuckets + neededBuckets))){
                neededBuckets++;
            }
            
            return neededBuckets;
            
        }
        
        
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width <= 0 || height <= 0 || areaPerBucket <= 0 ){
            return -1;
        }
        
        double totalArea = width * height;
        
        int numberOfBuckets =  (int)Math.ceil(totalArea/areaPerBucket);
        
        return numberOfBuckets;
    }
    
     public static int getBucketCount(double area, double areaPerBucket){
         if(area <= 0 || areaPerBucket <= 0){
             return -1;
         }
         
        int numberOfBuckets =  (int)Math.ceil(area/areaPerBucket);
        
        return numberOfBuckets;
     }
    

}
