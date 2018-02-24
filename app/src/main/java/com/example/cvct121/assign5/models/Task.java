package com.example.cvct121.assign5.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.ForeignKey;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by CVCT121 on 2/23/2018.
 */

@Table(database = MyDatabase.class)
public class Task extends BaseModel
{

    @Column
    @PrimaryKey(autoincrement = true)
    int id;


    @Column
    String name;

    @Column
    int price;

    @Column
    int imageResourse;

    @Column
    boolean finished;

    @Column
    @ForeignKey(saveForeignKeyModel = false)
    Project project;


    public void setProject(Project project) {
        this.project = project;
    }

    public Project getProject() {

        return project;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setImageResourse(int imageResourse) {
        this.imageResourse = imageResourse;
    }

    public void setFinished(boolean finished) {
        this.finished = finished;
    }

    public String getName() {

        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getImageResourse() {
        return imageResourse;
    }

    public boolean isFinished() {
        return finished;
    }


    public void setOrganization(Project project) {
        this.project = project;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getId() {
        return this.id;
    }

}