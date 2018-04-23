db.createCollection('dailyHealthRecords', {});

db.dailyHealthRecords.insert(
    {
        "id": 1234,
        "created": "datetime",
        "pulse": 84,
        "sysPressure": 140,
        "diaPressure": 80,
        "weight": 84500,
        "sleepDuration": 16,
        "description": "Today was a bad day",
        "group": {
            "name": "string",
            "desctiption": "string description"
        }
    });
try {
    print(db.dailyHealthRecords.find());
}catch(ex){
    print(ex)
}