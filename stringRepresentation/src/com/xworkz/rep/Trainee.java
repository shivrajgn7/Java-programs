package com.xworkz.rep;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
//@Getter
//@Setter
@Data
public class Trainee {
    private int traineId;
    private String traineeName;


    @Override
    public String toString() {
        return "Trainee:traineeId="+this.traineId+"traineeName="+this.traineeName;
    }
    @Override
    public boolean equals(Object o){

        if(o instanceof Trainee){
            Trainee trainee2=(Trainee) o;
            if(this.traineId==trainee2.traineId&&this.traineeName==trainee2.traineeName)
                return true;
        }
        return false;
    }

//    public int hashcode(){
//
//    }
}

