using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace assignment6
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            // TODO: This line of code loads data into the 'assignment6DataSet.SunflowerCom' table. You can move, or remove it, as needed.
            this.sunflowerComTableAdapter.Fill(this.assignment6DataSet.SunflowerCom);

        }

        private void button2_Click(object sender, EventArgs e)
        {
            string strName = txtProduct.Text;
            this.sunflowerComTableAdapter.NameQ(this.assignment6DataSet.SunflowerCom, strName);
        }

        private void nameQToolStripButton_Click(object sender, EventArgs e)
        {
            try
            {
                this.sunflowerComTableAdapter.NameQ(this.assignment6DataSet.SunflowerCom, titleToolStripTextBox.Text);
            }
            catch (System.Exception ex)
            {
                System.Windows.Forms.MessageBox.Show(ex.Message);
            }

        }
    }
}
