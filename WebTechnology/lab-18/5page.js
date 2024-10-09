const http = require('http');
const url = require('url');

const server = http.createServer((req, res) => {
    // res.end(' <h1>Welcome to Home Page</h1>')
    if(res)
    res.end('<a href="file:///C:/Users/shrey/OneDrive/Desktop/study%20material/Semester-2/WD/WD(lab)/lab-13/part1.html"><button>About Us</button></a>')
});
  

server.listen(3000, () => {
  console.log('Server started on localhost:3000!');
});