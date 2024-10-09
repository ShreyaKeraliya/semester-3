const express=require('express');
const mongoose = require("mongoose");
const Student = require("./Student");
const bodyParser = require("body-parser");


const connectionString="mongodb+srv://darshi90837:darshi90837@cluster0.agqw8.mongodb.net/"

mongoose.connect(connectionString).then(()=>{
    console.log("Cloud started");

    const app = express();
  app.use(bodyParser.urlencoded({ extended: false }));

//get all method
  app.get("/students", async (req, res) => {
    const ans = await Student.find();
    res.send(ans);
  });

  //get by id 

  app.get("/students/:rollNo",async(req,res)=>{
    console.log(req.params.rollNo)
    const ans=await Student.findOne({rollNo:req.params.rollNo})
    res.send(ans)
  })

  //post 

  app.post('/students',async(req,res)=>{
    stu=new Student({...req.body})
    const ans= await stu.save()
    res.send(ans);
  })

  //patch

  app.patch('/students/:rollNo',async(req,res)=>{
    const stu = await Student.findOne({rollNo:req.params.rollNo})
    stu.rollNo=req.body.rollNo,
    stu.name=req.body.name,
    stu.email=req.body.email,
    stu.age=req.body.age
    const ans = await stu.save()
    res.send(ans)
  })

app.listen(3000, () => {
    console.log("Server started @ 3000");
  });
});