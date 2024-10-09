// const express = require("express");
// const mongoose = require("mongoose");
// const bodyParser = require("body-parser")
// const faculty = require('./faculty_schema');

// const ConnectionString = "mongodb+srv://Shreya17092005:Shreya17092005@cluster0.l7bxj.mongodb.net/"
// mongoose.connect(ConnectionString, {})
// .then(() => {
//     console.log('Connected to MongoDB')
//     const app = express();
//     app.get('/facultys',async (req,res)=>{
//         const faculty = await Faculty.find();
//         res.json(faculty);
//     })

//     app.listen(3000,()=>{
//         console.log('Server is running on port 3000')
//     })
// })
const express = require("express");
const mongoose = require("mongoose");
const Faculty = require("./faculty_schema");
const bodyParser = require("body-parser");

const ConnectionString =
  "mongodb+srv://Shreya17092005:Shreya17092005@cluster0.l7bxj.mongodb.net/";
mongoose.connect(ConnectionString).then(() => {
  console.log("Cloud started");

  const app = express();
  app.use(bodyParser.urlencoded({ extended: false }));

  //get by all method

  app.get("/faculties", async (req, res) => {
    const ans = await Faculty.find();
    res.send(ans);
  });

  //get by id method

  app.get('/faculties/:name',async(req,res)=>{
    const ans = await Faculty.findOne({name:req.params.name})
    res.send(ans)
  });

  //post method

  app.post('/faculties',async(req,res)=>{
    fac=new Faculty({
        ...req.body
    });
    const ans = fac.save();
    res.send(ans);
  })

  app.listen(3002, () => {
    console.log("Server started @ 3000");
  });
});
