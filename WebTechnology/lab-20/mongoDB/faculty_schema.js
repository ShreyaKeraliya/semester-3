const mongoose = require('mongoose')

const schema = mongoose.Schema(
    {
        name: String,
        email: String,
        FacultyID: Number,
        age : Number
        }
);

module.exports = mongoose.model("faculty",schema);