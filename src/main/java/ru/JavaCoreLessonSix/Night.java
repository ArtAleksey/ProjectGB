package ru.JavaCoreLessonSix;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Night {

    @JsonProperty("IconPhrase")
    private String iconPhrase;

    public Night() {
    }

    public Night(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    public String getIconPhrase() {
        return iconPhrase;
    }

    public void setIconPhrase(String iconPhrase) {
        this.iconPhrase = iconPhrase;
    }

    @Override
    public String toString() {
        return "Night{" +
                "iconPhrase='" + iconPhrase + '\'' +
                '}';
    }
}
