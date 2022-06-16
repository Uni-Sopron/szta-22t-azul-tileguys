

import java.util.Map;


public class PlayerBoard {
    private int points;

    public void calculatePoints(Wall wall, SampleTileRow sampleTileRow){}

    public class SampleTileRow {
        private int count;
        
        public void setRow(SampleTileRow row){}
    
        public void getRow(SampleTileRow row){}
    
    }

    public class Wall {
        int wall[][] = new int[4][4];
    
        public Wall(){
            
        }
    }

    public class BrokenTiles{
        int[] brokenTiles;

        public void addBrokenTiles(){}
    }
}
