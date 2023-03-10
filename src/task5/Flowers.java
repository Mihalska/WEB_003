package task5;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "flower"
})
@XmlRootElement(name = "Flowers")
public class Flowers {

    protected List<Flowers.Flower> flower;

    public List<Flowers.Flower> getFlower() {
        if (flower == null) {
            flower = new ArrayList<>();
        }
        return this.flower;
    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "name",
            "soil",
            "origin",
            "visualРarameters",
            "grovinTips",
            "multiplying"
    })
    public static class Flower {

        @XmlElement(required = true)
        protected String name;
        @XmlElement(required = true)
        protected String soil;
        @XmlElement(required = true)
        protected String origin;
        @XmlElement(name = "visual_рarameters", required = true)
        protected Flowers.Flower.VisualРarameters visualРarameters;
        @XmlElement(name = "grovin_tips", required = true)
        protected Flowers.Flower.GrovinTips grovinTips;
        @XmlElement(required = true)
        protected String multiplying;

        public String getName() {
            return name;
        }

        public void setName(String value) {
            this.name = value;
        }

        public String getSoil() {
            return soil;
        }

        public void setSoil(String value) {
            this.soil = value;
        }

        public String getOrigin() {
            return origin;
        }

        public void setOrigin(String value) {
            this.origin = value;
        }

        public Flowers.Flower.VisualРarameters getVisualРarameters() {
            return visualРarameters;
        }

        public void setVisualРarameters(Flowers.Flower.VisualРarameters value) {
            this.visualРarameters = value;
        }

        public Flowers.Flower.GrovinTips getGrovinTips() {
            return grovinTips;
        }

        public void setGrovinTips(Flowers.Flower.GrovinTips value) {
            this.grovinTips = value;
        }


        public String getMultiplying() {
            return multiplying;
        }

        public void setMultiplying(String value) {
            this.multiplying = value;
        }

        @Override
        public String toString() {
            return "Flower{" +
                    "name='" + name + '\'' +
                    ", soil='" + soil + '\'' +
                    ", origin='" + origin + '\'' +
                    ", visualРarameters=" + visualРarameters +
                    ", grovinTips=" + grovinTips +
                    ", multiplying='" + multiplying + '\'' +
                    '}'+ '\n';
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "temperatureCelsius",
                "lighting",
                "wateringMilliliters"
        })
        public static class GrovinTips {

            @XmlElement(name = "temperature_celsius")
            protected int temperatureCelsius;
            @XmlElement(required = true)
            protected String lighting;
            @XmlElement(name = "watering_milliliters")
            protected int wateringMilliliters;

            public int getTemperatureCelsius() {
                return temperatureCelsius;
            }

            public void setTemperatureCelsius(int value) {
                this.temperatureCelsius = value;
            }

            public String getLighting() {
                return lighting;
            }

            public void setLighting(String value) {
                this.lighting = value;
            }

            public int getWateringMilliliters() {
                return wateringMilliliters;
            }

            public void setWateringMilliliters(int value) {
                this.wateringMilliliters = value;
            }

            @Override
            public String toString() {
                return "{" +
                        "temperatureCelsius=" + temperatureCelsius +
                        ", lighting='" + lighting + '\'' +
                        ", wateringMilliliters=" + wateringMilliliters +
                        '}';
            }
        }

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "stemColor",
                "leafColor",
                "size"
        })
        public static class VisualРarameters {

            @XmlElement(name = "stem_color", required = true)
            protected String stemColor;
            @XmlElement(name = "leaf_color", required = true)
            protected String leafColor;
            protected int size;

            public String getStemColor() {
                return stemColor;
            }

            public void setStemColor(String value) {
                this.stemColor = value;
            }

            public String getLeafColor() {
                return leafColor;
            }
            public void setLeafColor(String value) {
                this.leafColor = value;
            }

            public int getSize() {
                return size;
            }
            public void setSize(int value) {
                this.size = value;
            }

            @Override
            public String toString() {
                return "{" +
                        "stemColor='" + stemColor + '\'' +
                        ", leafColor='" + leafColor + '\'' +
                        ", size=" + size +
                        '}';
            }
        }

    }

}
