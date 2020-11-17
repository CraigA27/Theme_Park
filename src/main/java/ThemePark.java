import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark(){
        this.attractions = new ArrayList<Attraction>();
        this.stalls = new ArrayList<Stall>();
    }

    public int getNumberOfAttractions(){
        return this.attractions.size();
    }

    public void addAttraction(Attraction attraction){
        this.attractions.add(attraction);
    }

    public int getNumberOfStalls(){
        return this.stalls.size();
    }

    public void addStall(Stall stall){
        this.stalls.add(stall);
    }

    public ArrayList<IReviewed> getAllIReviewed(){
        ArrayList<IReviewed> reviewed = new ArrayList<IReviewed>();
        reviewed.addAll(attractions);
        reviewed.addAll(stalls);
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addToVisitCount();
        visitor.addAttractionToList(attraction);

    }


}
