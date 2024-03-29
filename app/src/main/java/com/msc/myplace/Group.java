package com.msc.myplace;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by tosh8 on 30.04.2016.
 */

public class Group implements Serializable{
    public String id;
    public String familyName;
    public ArrayList<Member> members = new ArrayList<>(0);

    public Group() {

    }

    public Group(String familyName) {
        id = UUID.randomUUID().toString();
        this.familyName = familyName;
        members = new ArrayList<>(0);
    }

    public void addMember(Member member) {
        members.add(member);
    }

}
