package uoc.birds;

import java.util.ArrayList;

public class SpeciesManager {

  private ArrayList<Species> speciesArrayList;

  public SpeciesManager(ArrayList<Species> speciesArrayList) {
    this.speciesArrayList = speciesArrayList;
  }

  public ArrayList<Species> getSpeciesArrayList() {
    return speciesArrayList;
  }

  public void setSpeciesArrayList(ArrayList<Species> speciesArrayList) {
    this.speciesArrayList = speciesArrayList;
  }

  public void addSpecies(Species species){
    this.speciesArrayList.add(species);
  }
}
