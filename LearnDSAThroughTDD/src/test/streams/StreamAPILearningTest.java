package test.streams;

import main.model.Person;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPILearningTest {
    @Test
    public void returnListOfNameAfterFilterByUUID(){
        List<Person> persons = Arrays.asList(new Person("kartheek", "G", "31"), new Person("Veena", "Malik", "35"), new Person("Meena", "Pk", "17") );
        List<String> firstNameList = persons.stream().filter(p -> p.getAge() != "17")
                                                    .map(person -> person.getFirstName())
                                                    .collect(Collectors.toList());
        for (String name :
                firstNameList) {
            System.out.println(name);
        }
    }
    @Test
    public void understnadBilderDesignPattern(){
        OneStoryHouseBuilder one = new OneStoryHouseBuilder("2 bedrooms, 2.5 baths, 2-car garage, 1500 sqft");
        TwoStoryHouseBuilder two = new TwoStoryHouseBuilder("4 betrroms, 5 baths 3 cars garage 2800sqft");

        WorkShop workShop = new WorkShop();
        workShop.construct(one);
        workShop.construct(two);

        System.out.println(one.showProgress());
        System.out.println(two.showProgress());
    }
    

}

class WorkShop{
    public void construct(HouseBuilder houseBuilder){
        
        houseBuilder.buildFoundation();
        houseBuilder.buildFrame();
        houseBuilder.buildExterior();
        houseBuilder.buildInterior();

    }


}
    abstract class HouseBuilder {

        protected House house = new House();

        protected String showProgress(){
          return house.toString();
        }

        public abstract void buildFoundation();

        public abstract void buildFrame();

        public abstract void buildExterior();

        public abstract void buildInterior();

    }

      class House {
            private String type = null;
            private List features = new ArrayList();

          public House() {
          }

          public House(String type) {
              this.type = type;
          }

          public String getType() {
              return type;
          }

          public void setType(String type) {
              this.type = type;
          }

          public void setProgress(String featureName){
              features.add(featureName);
          }


          public String toString (){
              StringBuffer sf = new StringBuffer();
              String value = type.substring(6);
              sf.append(value + "\n");
              for (int i = 0; i < features.size(); i++) {
                  sf.append(features.get(i)+"\n");

              }
              return sf.toString();
          }
      }

      class OneStoryHouseBuilder extends HouseBuilder{

          public OneStoryHouseBuilder(String features) {
              house.setType(this.getClass() + " "+ features);
          }

          @Override
          public void buildFoundation() {
                house.setProgress("Foundation is done");
          }

          @Override
          public void buildFrame() {
              house.setProgress("frame is done");
          }

          @Override
          public void buildExterior() {
                house.setType("Exterior is under going ");
          }

          @Override
          public void buildInterior() {
              house.setProgress("Interior yet to start :: ");
          }
      }

      class TwoStoryHouseBuilder extends HouseBuilder{
            TwoStoryHouseBuilder (String features){
                house.setType(this.getClass()+" "+ features);

            }
          @Override
          public void buildFoundation() {
              house.setProgress("Foundation is done");
          }

          @Override
          public void buildFrame() {
              house.setProgress("frame is in progress");

          }

          @Override
          public void buildExterior() {
              house.setProgress("exterior is under progress");

          }

          @Override
          public void buildInterior() {
              house.setProgress("interior yet to start");

          }
      }


