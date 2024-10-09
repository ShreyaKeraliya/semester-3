import React from "react";
import Layout from "./../components/Layout/Layout";

const Policy = () => {
  return (
    <Layout>
      <div className="row contactus ">
        <div className="col-md-6 ">
          <img
            src="https://img.freepik.com/free-photo/top-view-set-ice-cream-cones-with-chocolate_23-2148425392.jpg?t=st=1727588659~exp=1727592259~hmac=3a823960b8811b9df4e24f63b4658bd3667c4ab8d282be4ed79128b68bcb8dbe&w=900"
            alt="contactus"
            style={{ width: "100%" }}
          />
        </div>
        <div className="col-md-4">
        <h1 className="bg-dark p-2 text-white text-center">Privacy Policy</h1>
          <p>We collect personal information that you voluntarily provide to us when you express an interest in obtaining information about us or our products and Services, when you participate in activities on the Services, or otherwise when you contact us
            Personal Information Provided by You. The personal information that we collect depends on the context of your interactions with us and the Services, the choices you make, and the products and features you use. The personal information we collect may include the following:</p>
          <ul>
            <li>First and last name</li>
            <li>Email address</li>
            <li>Phone number</li>
            <li>Address</li>
            <li>Payment information</li> 
          </ul>
        </div>
      </div>
    </Layout>
  );
};

export default Policy;
