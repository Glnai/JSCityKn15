/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Build;

import java.util.ArrayList;
import java.util.List;

import eu.printingin3d.javascad.models.Abstract3dModel;
import eu.printingin3d.javascad.coords.Coords3d;
import eu.printingin3d.javascad.coords.Dims3d;
import eu.printingin3d.javascad.models.*;
import eu.printingin3d.javascad.tranzitions.Difference;
import eu.printingin3d.javascad.tranzitions.Union;

class Build extends Union {
    
    static double first_floor = 1175, middle_floor = -387.5, middle_floor_w1 = -325, last_floor = -450;
    Build() { super(getModels()); }

    private static List<Abstract3dModel> getModels() {
        
        List<Abstract3dModel> models = new ArrayList<Abstract3dModel>();
        List<Abstract3dModel> ff = new ArrayList<Abstract3dModel>();
        List<Abstract3dModel> mf = new ArrayList<Abstract3dModel>();
        List<Abstract3dModel> lf = new ArrayList<Abstract3dModel>();

        Union first = new Union(
                new Cube(new Dims3d(2550, 400, 550)).move(new Coords3d(0, 0, 250)),
                new Cube(new Dims3d(1590, 300, 40)).move(new Coords3d(525, 0, 530)),
                new Cube(new Dims3d(190, 200, 40)).move(new Coords3d(-1225, 0, 530)),
                new Cube(new Dims3d(150, 400, 50)).move(new Coords3d(1250, 0, 120)),
                new Cube(new Dims3d(150, 400, 50)).move(new Coords3d(1250, 0, 295)),
                new Cube(new Dims3d(200, 400, 350)).move(new Coords3d(-1300, 0, 150)),
                new Cube(new Dims3d(300, 400, 160)).move(new Coords3d(-1500, 0, 55))
        );      
        
       while(first_floor >= -1275){
            ff.add(new Cube(new Dims3d(75, 75, 120)).move(new Coords3d(first_floor, -170 , 200)));
            ff.add(new Cube(new Dims3d(75, 75, 120)).move(new Coords3d(first_floor, -170 , 400)));
            first_floor -= 125;
        }
            ff.add(new Cube(new Dims3d(75, 75, 120)).move(new Coords3d(-1325, -170 , 200)));
            ff.add(new Cube(new Dims3d(200, 75, 140)).move(new Coords3d(1112.5, -170 , 30)));
            ff.add(new Cube(new Dims3d(200, 75, 140)).move(new Coords3d(862.5, -170 , 30)));
            ff.add(new Cube(new Dims3d(825, 75, 140)).move(new Coords3d(300, -170 , 30)));
            ff.add(new Cube(new Dims3d(200, 75, 140)).move(new Coords3d(-262.5,-170,30)));
            ff.add(new Cube(new Dims3d(200, 75, 140)).move(new Coords3d(-512.5,-170,30)));
            ff.add(new Cube(new Dims3d(200, 75, 140)).move(new Coords3d(-762.5,-170,30)));
            ff.add(new Cube(new Dims3d(200, 75, 140)).move(new Coords3d(-1012.5,-170,30)));
            ff.add(new Cube(new Dims3d(200, 75, 140)).move(new Coords3d(-1262.5,-170,30)));
            ff.add(new Cube(new Dims3d(200, 1000, 140)).move(new Coords3d(-1512.5,-170,30)));
                        
            ff.add(new Cube(new Dims3d(100,30,140)).move(new Coords3d(-1612.5,0,30)));
            ff.add(new Cube(new Dims3d(100,30,140)).move(new Coords3d(-1612.5,75,30)));
            ff.add(new Cube(new Dims3d(100,30,140)).move(new Coords3d(-1612.5,150,30)));
            ff.add(new Cube(new Dims3d(100,30,140)).move(new Coords3d(-1612.5,-75,30)));
            ff.add(new Cube(new Dims3d(100,30,140)).move(new Coords3d(-1612.5,-150,30)));  
            
            Union first_f = new Union(ff);
            
           Difference first_dif = new Difference(
            first,first_f
            );
           
            Union middle = new Union(
            
             new Cube(new Dims3d(1040,400,1000)).move(new Coords3d(-755,0,1000)),
             new Cube(new Dims3d(1160,400,145)).move(new Coords3d(-695,0,1540)),
             new Cube(new Dims3d(1270,400,145)).move(new Coords3d(-640,0,1640)),
             new Cube(new Dims3d(1280,400,145)).move(new Coords3d(-505,0,1740)),
             new Cube(new Dims3d(1280,400,145)).move(new Coords3d(-390,0,1840)),
             new Cube(new Dims3d(1770,400,145)).move(new Coords3d(-5,0,1940)),
             new Cube(new Dims3d(1660,400,145)).move(new Coords3d(50,0,2040)),
             new Cube(new Dims3d(1520,400,145)).move(new Coords3d(120,0,2140))
            ); 
            
            while(middle_floor >= -1312){
            mf.add(new Cube(new Dims3d(200,75,200)).move(new Coords3d(middle_floor,-170,600)));
            middle_floor -= 250;
            }
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+125,-170, 1540)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+125,-170, 1640)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+250,-170, 1640)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+250,-170, 1740)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+375,-170, 1740)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+375,-170, 1840)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+500,-170, 1840)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+500,-170, 1940)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+625,-170, 1940)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+750,-170, 1940)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+625,-170, 2040)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+750,-170, 2040)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+750,-170, 2140)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+875,-170, 2140)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+1000,-170, 2140)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+1125,-170, 2140)));
            mf.add(new Cube(new Dims3d(325,75,180)).move(new Coords3d(middle_floor_w1+1000,-170,1990)));
            
            while(middle_floor_w1 >= -1312){
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 785)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 910)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 1035)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 1160)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 1285)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 1410)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 1540)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1,-170, 1640)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+125,-170, 1740)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+250,-170, 1840)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+375,-170, 1940)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+500,-170, 2040)));
            mf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(middle_floor_w1+625,-170, 2140)));
            middle_floor_w1 -=125;
            }
            Union middle_f = new Union(mf);
            Difference second_dif = new Difference(
            middle,middle_f
            );
            
             Union last = new Union(
               new Cube(new Dims3d(3020,400,145)).move(new Coords3d(990,0,2240)),
               new Cube(new Dims3d(2900,400,145)).move(new Coords3d(1050,0,2340)),
               new Cube(new Dims3d(2780,400,145)).move(new Coords3d(1110,0,2440)),
               new Cube(new Dims3d(2530,400,600)).move(new Coords3d(1120,0,2740))

        );      
            
            
            while (last_floor < 2500)
            {
                lf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(last_floor,-170, 2240)));
                lf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(last_floor+125,-170, 2340)));
                lf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(last_floor+250,-170, 2440)));
                lf.add(new Cube(new Dims3d(75, 75, 150)).move(new Coords3d(last_floor+375,-170, 2620)));
                lf.add(new Cube(new Dims3d(75, 75, 150)).move(new Coords3d(last_floor+375,-170, 2820)));
                lf.add(new Cube(new Dims3d(75, 75, 75)).move(new Coords3d(last_floor+375,-170, 2970)));
                last_floor +=125;
            }
            
            Union last_f = new Union(lf);
            Difference last_dif = new Difference(
            last,last_f
            );
            
            
            models.add(first_dif);
            models.add(second_dif);
            models.add(last_dif);
        return models;
    }
}