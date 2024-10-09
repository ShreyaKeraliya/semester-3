const express = require('express')
const path = require('path')
const app = express();

app.get('/Home', (req, res) => {
  res.sendFile(path.join(__dirname, 'LandingPage.html')
    `<h1>Welcome to Home Page</h1>
    <button><a  style="text-decoration: none; color: black;"href="/About" >Home</a></button>
    <button><a style="text-decoration: none; color: black;"href="/Services">Services</a></button>
    <button><a style="text-decoration: none; color: black;"href="/ContactUs">Contact Us</a></button> `);
})
app.get('/About', (req, res) => {
    res.send(`
    <div id="body">
      <h1>Welcome to About Page</h1>
      <button><a  style="text-decoration: none; color: black;"href="/Home" >Home</a></button>
      <button><a style="text-decoration: none; color: black;"href="/Services">Services</a></button>
      <button><a style="text-decoration: none; color: black;"href="/ContactUs">Contact Us</a></button> 
      </div>
      `);
  })
  app.get('/Services', (req, res) => {
    res.send(`
    <div id="body">
      <h1>Welcome to Services</h1>
      <button><a style="text-decoration: none; color: black;" href="/Home" >Home</a></button>
      <button><a style="text-decoration: none; color: black;"href="/About">About Us</a></button>
      <button><a style="text-decoration: none; color: black;"href="/ContactUs">Contact Us</a></button> 
      </div> 
      `);
  })
  app.get('/ContactUs', (req, res) => {
    res.send(`
    <div id="body">
      <h1>Welcome to Contact Us Page</h1>
      <button><a style="text-decoration: none; color: black;"href="/Home" >Home</a></button>
      <button><a style="text-decoration: none; color: black;" href="/About">About Us</a></button>
      <button><a style="text-decoration: none; color: black;"href="/Services">Services</a></button>
      </div>
      `);
  })

app.listen(3000, () => {
  console.log('Server is running on port 3000');
})