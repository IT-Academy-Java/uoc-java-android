package uoc.birds;

public class Municipality {

  private String nameMunicipality;
  private String numberSpecies;

  public Municipality() {
  }

  public Municipality(String nameMunicipality, String numberSpecies) {
    this.nameMunicipality = nameMunicipality;
    this.numberSpecies = numberSpecies;
  }

  public String getNameMunicipality() {
    return nameMunicipality;
  }

  public void setNameMunicipality(String nameMunicipality) {
    this.nameMunicipality = nameMunicipality;
  }

  public String getNumberSpecies() {
    return numberSpecies;
  }

  public void setNumberSpecies(String numberSpecies) {
    this.numberSpecies = numberSpecies;
  }
}
