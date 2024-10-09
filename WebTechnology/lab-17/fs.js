const fs = require('fs');
// fs.exists('pathdemo.js',(data)=>{
//     console.log(data+'file exists');
// }); 

// stat method
// fs.stat('pathdemo.js',(data)=>{
//             console.log(data);
// })

//read file
// fs.readFile('pathdemo.js',(err,data)=>{
//     console.log(data.toString());
// })

//writefile method
// fs.writeFile('fsdemo','just write somthing',(err,data)=>{
//     console.log("done");
// })
//appendfile method
fs.appendFile('fsdemo','done writig',(err,data)=>{
    console.log("done");
})