package uoc.birds;

import java.util.ArrayList;

public class MunicipalityManager {

  private ArrayList<Municipality> municipalityArrayList;

  public MunicipalityManager() {
  }

  public MunicipalityManager(ArrayList<Municipality> municipalityArrayList) {
    this.municipalityArrayList = municipalityArrayList;
  }

  public ArrayList<Municipality> getMunicipalityArrayList() {
    return municipalityArrayList;
  }

  public void setMunicipalityArrayList(ArrayList<Municipality> municipalityArrayList) {
    this.municipalityArrayList = municipalityArrayList;
  }

  public void addMunicipality(Municipality municipality){
    this.municipalityArrayList.add(municipality);
  }
}
