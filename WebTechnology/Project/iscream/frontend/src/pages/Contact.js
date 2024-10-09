import React from "react";
import Layout from "./../components/Layout/Layout";
import { BiMailSend, BiPhoneCall, BiSupport } from "react-icons/bi";
import '../Style/Contact.css';

const Contact = () => {
  return (
    <Layout>
      <div className="row contactus ">
        <div className="col-md-6 ">
          <img
            src="https://img.freepik.com/free-photo/top-view-delicious-creamy-ice-cream_23-2150796528.jpg?t=st=1727588224~exp=1727591824~hmac=d3d0108eee2ae78670e701df0c06745b40fb89ef2a230d78d616fbbe4ab97277&w=740"
            alt="contactus"
            style={{ width: "100%" }}
          />
        </div>
        <div className="col-md-4">
          <h1 className="bg-dark p-2 text-white text-center">CONTACT US</h1>
          <p className="text-justify mt-2">
            any query and info about Quality, Texture feel free to call anytime we 24X7
            available 
          </p>
          <p className="mt-3">
            <BiMailSend /> : 23010101138@darshan.ac.in
          </p>
          <p className="mt-3">
            <BiPhoneCall /> : 0123456789
          </p>
          <p className="mt-3">
            <BiSupport /> : 9876543210
          </p>
        </div>
      </div>
    </Layout>
  );
};

export default Contact;
