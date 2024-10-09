const express = require ('express');
const app = express();
const bodyParser = require('body-parser')

students = [
    {
        id:1134,
        name:'darshi',
        age:19
    },

    {
        id:1114,
        name:'mansi',
        age:18
    },

    {
        id:1124,
        name:'riya',
        age:20
    }
];

app.use(bodyParse.urlencoded)

app.get('/students',(req,res)=>{
    res.send(students)
})

app.get('/students/:name',(req,res)=>{
   const ans = students.find((stu)=>{
    if(stu.name==req.params.name){
        return true;
    }
   })
   res.send(ans)
})

app.post('/students',(req,res)=>{
        id=students.length+1;
        const obj={
            id:id,
            name:req.body.name,
            age:req.body.age
        }
        students.push(obj);
        res.send(students)
})

app.delete('/students',(req,res)=>{
    const id = req.params.id;
    students.splice(id,1)
    res.send(students)
})

app.put('/students/:id',(req,res)=>{
    students[req.params.id].name=req.body.name;
    res.send(students)
})

app.listen(3000,()=>{
    console.log('Server is running @ 3000')
})