const mongoose = require('mongoose')

const schema = mongoose.Schema({
    rollNo:String,
    name:String,
    email:String,
    age:String
});

module.exports=mongoose.model("Student",schema)
