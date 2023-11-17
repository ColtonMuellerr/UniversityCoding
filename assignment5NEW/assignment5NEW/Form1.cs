using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;



namespace assignment5NEW
{
    
    public partial class Form1 : Form
    {
       

        public Form1()
        {
            InitializeComponent();
            
        }

        


        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'assignment_5DataSet.Order' table. You can move, or remove it, as needed.
            this.orderTableAdapter.Fill(this.assignment_5DataSet.Order);

        }

        

        private void btnOrder_Click(object sender, EventArgs e)
        {
            int intCustomerID, intAmount;
            DateTime dtOrderDate;
            bool boolChckbox;

            boolChckbox = checkBox2.Checked;

            if (int.TryParse(txtCustomerID2.Text, out intCustomerID) == false || int.TryParse(txtAmount2.Text, out intAmount) == false)
                return;
            if (DateTime.TryParse(txtOrderDate.Text, out dtOrderDate) == false) return;

            
            this.orderTableAdapter.Insert(intCustomerID, dtOrderDate, intAmount, boolChckbox);
            this.orderTableAdapter.Fill(this.assignment_5DataSet.Order);

            txtCustomerID2.Clear();
            txtAmount2.Clear();
            txtOrderDate.Clear();
            checkBox2.Checked = false;
            txtCustomerID2.Focus();
        }
    }
}
