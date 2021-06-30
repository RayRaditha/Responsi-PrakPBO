/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moviereview;

import modeldatabase.Connector;
import view.MovieView;

/**
 *
 * @author Raditha
 */
public class MovieReview {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Connector DB = new Connector();
        
        MovieView movieview = new MovieView(DB);
        movieview.setVisible(true);
    }
    
}
