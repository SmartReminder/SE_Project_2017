/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author kan
 */
public class PersonalCalendar extends Calendar {
    
    //create an object of PersonalCalendar
    private static PersonalCalendar instance = new PersonalCalendar();
    
    private ArrayList<Schedule> scheduleList = new ArrayList<>();
    
    //make the constructor private so that this class cannot be instantiated
    private PersonalCalendar(){}
    
    //Get the only object available
    public static PersonalCalendar getInstance(){
        return instance;
    }
    
    private boolean isAvailable(Schedule schedule) {
        
        boolean returnVal = true;
        int[] newSchedulePhase = new int[48];
        for (int i = getPhase(schedule.getBeginTime()); i < getPhase(schedule.getFinishTime()); i++) {
            newSchedulePhase[i] = 1;
        }
        /*for (int i = 0; i < newSchedulePhase.length; i++) {
            System.out.print(newSchedulePhase[i]);
        }*/
        for (int i = 0; i < scheduleList.size(); i++) {
            int[] schedulePhase = new int[48];
            for (int j = getPhase(scheduleList.get(i).getBeginTime()); j < getPhase(scheduleList.get(i).getFinishTime()); j++) {
                schedulePhase[j] = 1;
            }
            
            /*for (int j = 0; j < schedulePhase.length; j++) {
                System.out.print(schedulePhase[j]);
            }
            System.out.println("");
            for (int j = 0; j < newSchedulePhase.length; j++) {
                System.out.print(newSchedulePhase[j]);
            }
            System.out.println("");*/
            
            for (int j = 0; j < schedulePhase.length; j++) {
                if(newSchedulePhase[j] == 1 & schedulePhase[j] == 1) {
                    returnVal = false;
                    break;
                }
            }
            if(returnVal == false) {
                break;
            }
        }
        
        return returnVal;
    }
    
    private int getPhase(Date date) {
        
        int phase;
        int hrs = date.getHours();
        int mins = date.getMinutes();
            
        if((hrs == 0) & (mins == 0)) {
            phase = 0;
        }
        else if((hrs == 0) & (mins == 30)) {
            phase = 1;
        }
        else if((hrs == 1) & (mins == 0)) {
            phase = 2;
        }
        else if((hrs == 1) & (mins == 30)) {
            phase = 3;
        }
        else if((hrs == 2) & (mins == 0)) {
            phase = 4;
        }
        else if((hrs == 2) & (mins == 30)) {
            phase = 5;
        }
        else if((hrs == 3) & (mins == 0)) {
            phase = 6;
        }
        else if((hrs == 3) & (mins == 30)) {
            phase = 7;
        }
        else if((hrs == 4) & (mins == 0)) {
            phase = 8;
        }
        else if((hrs == 4) & (mins == 30)) {
            phase = 9;
        }
        else if((hrs == 5) & (mins == 0)) {
            phase = 10;
        }
        else if((hrs == 5) & (mins == 30)) {
            phase = 11;
        }
        else if((hrs == 6) & (mins == 0)) {
            phase = 12;
        }
        else if((hrs == 6) & (mins == 30)) {
            phase = 13;
        }
        else if((hrs == 7) & (mins == 0)) {
            phase = 14;
        }
        else if((hrs == 7) & (mins == 30)) {
            phase = 15;
        }
        else if((hrs == 8) & (mins == 0)) {
            phase = 16;
        }
        else if((hrs == 8) & (mins == 30)) {
            phase = 17;
        }
        else if((hrs == 9) & (mins == 0)) {
            phase = 18;
        }
        else if((hrs == 9) & (mins == 30)) {
            phase = 19;
        }
        else if((hrs == 10) & (mins == 0)) {
            phase = 20;
        }
        else if((hrs == 10) & (mins == 30)) {
            phase = 21;
        }
        else if((hrs == 11) & (mins == 0)) {
            phase = 22;
        }
        else if((hrs == 11) & (mins == 30)) {
            phase = 23;
        }
        else if((hrs == 12) & (mins == 0)) {
            phase = 24;
        }
        else if((hrs == 12) & (mins == 30)) {
            phase = 25;
        }
        else if((hrs == 13) & (mins == 0)) {
            phase = 26;
        }
        else if((hrs == 13) & (mins == 30)) {
            phase = 27;
        }
        else if((hrs == 14) & (mins == 0)) {
            phase = 28;
        }
        else if((hrs == 14) & (mins == 30)) {
            phase = 29;
        }
        else if((hrs == 15) & (mins == 0)) {
            phase = 30;
        }
        else if((hrs == 15) & (mins == 30)) {
            phase = 31;
        }
        else if((hrs == 16) & (mins == 0)) {
            phase = 32;
        }
        else if((hrs == 16) & (mins == 30)) {
            phase = 33;
        }
        else if((hrs == 17) & (mins == 0)) {
            phase = 34;
        }
        else if((hrs == 17) & (mins == 30)) {
            phase = 35;
        }
        else if((hrs == 18) & (mins == 0)) {
            phase = 36;
        }
        else if((hrs == 18) & (mins == 30)) {
            phase = 37;
        }
        else if((hrs == 19) & (mins == 0)) {
            phase = 38;
        }
        else if((hrs == 19) & (mins == 30)) {
            phase = 39;
        }
        else if((hrs == 20) & (mins == 0)) {
            phase = 40;
        }
        else if((hrs == 20) & (mins == 30)) {
            phase = 41;
        }
        else if((hrs == 21) & (mins == 0)) {
            phase = 42;
        }
        else if((hrs == 21) & (mins == 30)) {
            phase = 43;
        }
        else if((hrs == 22) & (mins == 0)) {
            phase = 44;
        }
        else if((hrs == 22) & (mins == 30)) {
            phase = 45;
        }
        else if((hrs == 23) & (mins == 0)) {
            phase = 46;
        }
        else if((hrs == 23) & (mins == 30)) {
            phase = 47;
        }
        else {
            phase = 0;
        }
        
        return phase;
    }
    
    @Override
    public void addSchedule(Schedule schedule) {
        if(!scheduleList.isEmpty()) {
            if(isAvailable(schedule)) {
                scheduleList.add(schedule);
            }
            else
                System.out.println(schedule.getTitle() + " schedule is Overlap.");
        }
        else {
            scheduleList.add(schedule);
            System.out.println(schedule.getTitle() + " is first schedule.");
        }
        
    }
    
    @Override
    public void showSchedule() {
        for (int i = 0; i < scheduleList.size(); i++) {
            System.out.println(scheduleList.get(i).getTitle());
        }
    }
}
