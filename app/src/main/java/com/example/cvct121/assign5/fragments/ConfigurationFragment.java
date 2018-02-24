package com.example.cvct121.assign5.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.cvct121.assign5.R;
import com.example.cvct121.assign5.models.Project;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;
import java.util.Random;

import io.bloco.faker.Faker;

/**
 * A simple {@link Fragment} subclass.
 */
public class ConfigurationFragment extends Fragment implements  view OnClickListener
{

    private Button btnConfigurationFragmentGenerateData;
    private  Button buttoConfigurationFragmentShowData;
    private Button btnConfigurationFragmentDeleteAllDat;
    private EditText configurationFragmentNumberOfProjects;


    public ConfigurationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view  = inflater.inflate(R.layout.fragment_configuration, container);
        return inflater.inflate(R.layout.fragment_configuration, container, false);
    }

    @Override
    public  void OnClick(View view)
    {
        int viewId = view.getId();
        switch (viewId)
        {
            case R.id.btnConfigurationFragmentGenerateData:
                generateData();
                break;
            case  R.id.buttoConfigurationFragmentShowData:
                break;
            case R.id.btnConfigurationFragmentDeleteAllDat:
                break;

        }
    }

    public void  generateData() {
        Random generator = new Random();
        Faker faker = new Faker();
        faker.name.firstName();
        faker.company.name();
        int myInt = R.drawable.ic_menu_camera;

        int numberOfProject
        if (configurationFragmentNumberOfProjects.getText().toString().equals("")) {
            numberOfProject = 0;
        } else {
            numberOfProject = Integer.parseInt(configurationFragmentNumberOfProjects.getText().toString());
        }

        for (int count = 1; count <= numberOfProject; count++){
            Project project = new Project();
project.setDate(123456);
}
        List<Project> projectList = SQLite.select().from(Project.class).queryList();
       //og.e("", msg : "" + projectList.size());
for (int index = 0; index < projectList.size(); index++) { Project project = projectList.get(index); int maxTask = generator.nextInt(bound: 8) + 2;
}
    }