# FitnessConsultation Application

## RUNNING THE APPLICATION

1. Create the database to be used by this application
   ```
   
   create database asp; use asp;
   ```
2. Open terminal in the directory of the application and run:
   ```
    ./gradlew bootRun
   ```
3. Insert initial data which are the services offered by platform:
 ```
   INSERT INTO services (service)
    VALUES
    ('Fitness Assessments'),
    ('Individualized Workouts'),
    ('One-on-One Sessions'),
    ('Nutritional Counseling'),
    ('Goal Setting'),
    ('Form Correction'),
    ('Cardio Conditioning'),
    ('Strength Training'),
    ('Flexibility/Mobility'),
    ('Functional Movement'),
    ('Mindful Exercise'),
    ('Rehabilitation Support'),
    ('Dynamic Warm-Up/Cool Down'),
    ('Continuous Support'),
    ('Time-Efficient Workouts'),
    ('Fitness Reassessments'),
    ('Motivational Coaching'),
    ('Postural Correction'),
    ('Sports-Specific Training'),
    ('Holistic Lifestyle Advice'),
    ('Interval Training Programs'),
    ('Bodyweight Exercise Plans'),
    ('Agility and Coordination Drills'),
    ('Resistance Band Workouts'),
    ('Core Strengthening'),
    ('Injury Prevention Strategies'),
    ('Stress-Relief Techniques'),
    ('Customized Cross-Training'),
    ('Powerlifting Programs'),
    ('Plyometric Training');
```

4. You are now ready to use the REST API's of this application

## Grails 6.0.0 Documentation

- [User Guide](https://docs.grails.org/6.0.0/guide/index.html)
- [API Reference](https://docs.grails.org/6.0.0/api/index.html)
- [Grails Guides](https://guides.grails.org/index.html)
---

## Feature views-json documentation

- [Grails JSON Views documentation](https://views.grails.org/)

