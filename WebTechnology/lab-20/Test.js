const express = require("express");
const mongoose = require("mongoose");
const Faculty = require("./Faculty");
const bodyParser = require("body-parser");

const ConnectionString =
  "mongodb+srv://darshi90837:darshi90837@cluster0.agqw8.mongodb.net/";
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

  app.listen(3000, () => {
    console.log("Server started @ 3000");
  });
});
