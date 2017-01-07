package geoton.treveler.models;

import java.io.Serializable;

/**
 * Created by ADMIN on 12/25/2016.
 */

public class CharacterT implements Serializable{
        private String name,description,image;
        private String location;



    public CharacterT(String name, String description, String image, String location) {

        this.name = name;
        this.description = description;
        this.image = image;
        this.location=location;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation (String location){
        this.location=location;
    }


    @Override
    public String toString() {
        return "CharacterT{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", image='" + image + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
