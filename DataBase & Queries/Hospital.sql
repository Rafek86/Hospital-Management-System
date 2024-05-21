use HospitalManagement;

/*
CREATE TABLE Patiant_manu (
    P_ID INT PRIMARY KEY,
    Name VARCHAR(255),
    Number VARCHAR(20),
    Age INT,
    Gender VARCHAR(10),
    Address VARCHAR(255),
    [major disease] VARCHAR(50)
);

*/

INSERT INTO Patiant_manu (P_ID, Name, Number, Age, Gender, Address, [Major Disease])
VALUES 
(1, 'Ahmed', '01212345678', 18, 'male', 'eldoky', 'Diabetes'),
(2, 'Sarah', '01234567890', 25, 'female', 'Alex', 'Hypertension'),
(3, 'John', '09876543210', 30, 'male', 'Assuit', 'Asthma'),
(4, 'Mostafa', '01212345678', 20, 'male', 'Elsadat', 'Diabetes'),
(5, 'Rodina', '01234567890', 25, 'female', 'Sohag', 'Hypertension'),
(6, 'waad', '09876545670', 15, 'female', 'Alex', 'Asthma');

/*

CREATE TABLE Patient_Info (
    ID INT,
    FOREIGN KEY (ID) REFERENCES Patiant_manu(P_ID),
    symptom VARCHAR(200),
    diagnosis VARCHAR(200),
    medicines VARCHAR(200),
    wardreq VARCHAR(200),
    typeward VARCHAR(50)
);
*/
select * from Patient_Info

INSERT INTO Patient_Info (ID, symptom, diagnosis, medicines, wardreq, typeward) 
VALUES 
(1, 'Fever', 'Common cold', 'Paracetamol', 'Yes', 'General'),
(2, 'Cough', 'Bronchitis', 'Cough syrup', 'No', 'General'),
(3, 'Headache', 'Migraine', 'Painkillers', 'Yes', 'Single'),
(4, 'Stomach pain', 'Gastritis', 'Antacids', 'No', null),
(5, 'Backache', 'Muscle strain', 'Anti-inflammatory', 'Yes', 'Single'),
(6, 'Fatigue', 'Anemia', 'Iron supplements', 'Yes', 'Single');


DELETE FROM Patient_Info WHERE ID =125
DELETE FROM Patiant_manu WHERE P_ID =125 
