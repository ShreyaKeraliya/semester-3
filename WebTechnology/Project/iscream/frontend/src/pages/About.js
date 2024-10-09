import React from "react";
import Layout from "./../components/Layout/Layout";
import '../Style/About.css'; 

const About = () => {
  return (
    <Layout>
      <div className="row contactus ">
        <div className="col-md-6 ">
          <img className="imgA"
            src="https://naturalicecreams.in/wp-content/uploads/2023/12/Art-of-making-icecream-Image.jpg"
            alt="contactus"
            style={{ width: "100%" }}
          />
        </div>
        <div className="col-md-4">
          <p className="text-justify mt-2">
            <h2>ART OF MAKING ICE CREAM</h2>
            Naturals ice cream is loved across the country.
            A cup of Naturals ice cream is usually devoured in no time at all. 
            This is in stark contrast to the process that we follow to make our ice cream. 
            It’s slow and unhurried. The original taste of our ice creams is precisely due to
            the small batches in which they are made and the time we allow them to be created in. 
            While we have continued to grow, we still make our ice creams with a lot of love, care and TIME. 
            And originality of course!
          </p>
        </div>
      </div>
      <br/>
      <div className="row contact">
        <div className="col-md-12">
        <ul className="social-media-list ">
              <li><a href="#" target="_blank" className="contact-icon">
                <img className='imgi' src="https://cdn-icons-png.flaticon.com/128/49/49665.png" /></a>
              </li>
              <li><a href="#" target="_blank" className="contact-icon">
                <img className='imgi' src="https://cdn-icons-png.flaticon.com/128/3128/3128210.png" /></a>
              </li>
              <li><a href="#" target="_blank" className="contact-icon">
                <img className='imgi' src="https://cdn-icons-png.flaticon.com/128/3536/3536569.png" /></a>
              </li>
              <li><a href="#" target="_blank" className="contact-icon">
                <img className='imgi' src="https://cdn-icons-png.flaticon.com/128/4494/4494468.png" /></a>
              </li>
              <li><a href="#" target="_blank" className="contact-icon">
                <img className='imgi' src="https://cdn-icons-png.flaticon.com/128/3536/3536464.png" /></a>
              </li>       
            </ul>
        </div>
      
      </div>
    </Layout>
  );
};

export default About;
