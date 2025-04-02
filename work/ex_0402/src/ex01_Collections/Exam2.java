package ex01_Collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
class Student {
    String name;
    int totalScore;
    int subjectCount;
    
    public Student(String name) {
        this.name = name;
        this.totalScore = 0;
        this.subjectCount = 0;
    }
    
  
    public void addScore(int score) {
        this.totalScore += score;
        this.subjectCount++;
    }
    
   
    public double getAverage() {
        return (double) totalScore / subjectCount;
    }
    
  
    public String getName() {
        return name;
    }
}

public class Exam2 {
    public static void main(String[] args) {
       
        List<String> scores = Arrays.asList(
            "Alice:Math:85", "Alice:English:78",
            "Bob:Math:90", "Bob:English:92", "Bob:Science:88",
            "Charlie:Math:70", "Charlie:English:60"
        );
        
        
        HashMap<String, Student> stuInfoMap = new HashMap<>();
        
        
        for (String scoreInfo : scores) {
            String[] scoreInfoList = scoreInfo.split(":");
            String stuName = scoreInfoList[0];
            int score = Integer.parseInt(scoreInfoList[2]);
            
            
            Student student = stuInfoMap.getOrDefault(stuName, new Student(stuName));
            
           //name을 통해서 얻어온 Student객체를 통해 addScore 메서드를 호풀하고 점수를 전달
            student.addScore(score);
            
           //값이 없을때만 넣어(이미 키가 있으면 무시)
            stuInfoMap.put(stuName, student);
        }
        
        
        String topStudentName = null;
        double maxAverage = 0;
        
        for (Student student : stuInfoMap.values()) {
            double avg = student.getAverage();
            if (avg > maxAverage) {
                maxAverage = avg;
                topStudentName = student.getName();
            }
        }
        
      
        System.out.printf("가장 높은 평균 점수를 가진 학생: %s\n", topStudentName);
        System.out.printf("평균 점수: %.2f\n", maxAverage);
    }
}