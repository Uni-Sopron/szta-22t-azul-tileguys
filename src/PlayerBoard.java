

import java.util.Map;


public class PlayerBoard {
    private int points;

    public void calculatePoints(Wall wall, SampleTileRow sampleTileRow){}

    public class SampleTileRow {
        private int count;
        Map sampleTileRow1 = new Map(Tiles,count);
        Map sampleTileRow2 = new Map(Tiles,count);
        Map sampleTileRow3 = new Map(Tiles,count);
        Map sampleTileRow4 = new Map(Tiles,count);
        Map sampleTileRow5 = new Map(Tiles,count);
    
    
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
