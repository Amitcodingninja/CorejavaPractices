package org.Heap;

import java.util.PriorityQueue;
import java.util.Comparator;

// Patient class banayi
class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return "Patient: " + name + ", Severity: " + severity;
    }
}

// Hospital Max Heap class
class HospitalMaxHeap {
    PriorityQueue<Patient> maxHeap;

    public HospitalMaxHeap() {
        // Max Heap ke liye comparator banaya, severity descending order mein
        maxHeap = new PriorityQueue<>(new Comparator<Patient>() {
            @Override
            public int compare(Patient p1, Patient p2) {
                return p2.severity - p1.severity; // Bada severity pehle
            }
        });
    }

    public void addPatient(String name, int severity) {
        Patient patient = new Patient(name, severity);
        maxHeap.add(patient);
        System.out.println("Added: " + patient);
    }

    public String treatPatient() {
        if (maxHeap.isEmpty()) {
            return "Koi patient nahi hai queue mein!";
        }
        Patient patient = maxHeap.poll(); // Sabse severe patient nikala
        return "Treating: " + patient;
    }

    public static void main(String[] args) {
        HospitalMaxHeap hospital = new HospitalMaxHeap();

        // Patients add kar rahe hain
        hospital.addPatient("Rahul", 5);   // Normal
        hospital.addPatient("Priya", 20);  // Critical
        hospital.addPatient("Amit", 10);   // Serious
        hospital.addPatient("Sonia", 30);  // Very Critical

        // Patients treat karo
        System.out.println("\nTreatment Order:");
        System.out.println(hospital.treatPatient()); // Sonia (30)
        System.out.println(hospital.treatPatient()); // Priya (20)
        System.out.println(hospital.treatPatient()); // Amit (10)
        System.out.println(hospital.treatPatient()); // Rahul (5)
        System.out.println(hospital.treatPatient()); // Empty
    }
}