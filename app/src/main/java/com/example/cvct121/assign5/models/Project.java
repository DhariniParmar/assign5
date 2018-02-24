package com.example.cvct121.assign5.models;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by CVCT121 on 2/23/2018.
 */

@Table(database = MyDatabase.class)
public class Project extends BaseModel
{
    // ... field definitions that map to columns go here ...
    @Column
    @PrimaryKey(autoincrement = true)
    int id;

    @Column
    String name;

    @Column
    String discriptions;

    @Column
    String location;

    @Column
    long date;

    @Column
    int imageResourse;

    public void setId(int id) {
        this.id = id;
    }

    public void setDiscriptions(String discriptions) {
        this.discriptions = discriptions;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDate(long date) {
        this.date = date;
    }

    public void setImageResourese(int imageResourese) {
        this.imageResourse = imageResourese;
    }

    public String getDiscriptions() {

        return discriptions;
    }

    public String getLocation() {
        return location;
    }

    public long getDate() {
        return date;
    }

    public int getImageResourese() {
        return imageResourse;
    }

    public int getId()
    {
        return id;
    }

//  public void setId(int id)
//  {
//    this.id = id;
//  }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}