const http = require('http');

server = http.createServer((req,res)=>{
    res.end("1 ");
    
})
server.listen(3000,()=>{
    console.log('server is running on port 3000');
    })
