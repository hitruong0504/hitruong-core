using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exercise2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        
        private void boxXemphim_CheckedChanged(object sender, EventArgs e)
        {
            if (boxXemphim.Checked)
            {
                comboBox1.Enabled = true;
            }
            else { 
                comboBox1.Enabled=false;
            }
        }

        private void button1_Click(object sender, EventArgs e)
        {
            String gender;
            if (btnR2 == null)
            {
                gender = "Nữ";
            }
            else
            {
                gender = "Nam";
            }

            String category = null;
            if (boxXemphim.Checked && comboBox1.Text == "Thể loại yêu thích")
            {
                MessageBox.Show("Vui lòng chọn thể loại phim mà bạn yêu thích.");
                return;
            }
            else if (!boxXemphim.Checked)
            {
                category = null;
            }
            else
            {
                category = comboBox1.Text;
            }

            String sport = null;
            if (checkBox2.Checked && textBox.Text.Length == 0)
            {
                MessageBox.Show("Vui lòng nhập môn thể thao mà bạn yêu thích.");
                textBox.Focus();
                return;
            }
            else
            {
                sport = textBox.Text;
            }


            if(category == null && sport == null)
            {
                MessageBox.Show("Bạn là " + gender + ". Bạn sinh năm " + timePicker.Value.Year);
            }else if(category == null)
            {
                MessageBox.Show("Bạn là " + gender + ". Bạn sinh năm " + timePicker.Value.Year
                                + ".\n" + "Bạn không thích xem phim." + "\nBạn thích chơi " + sport);
            }else if(!checkBox2.Checked)
            {
                MessageBox.Show("Bạn là " + gender + ". Bạn sinh năm " + timePicker.Value.Year
                                + ".\n" + "Bạn thích xem phim " + category + "\nBạn không thích chơi thể thao.");
            }
            else
            {
                MessageBox.Show("Bạn là " + gender + ". Bạn sinh năm " + timePicker.Value.Year
                                + ".\n" + "Bạn thích xem phim " + category + "\nBạn thích chơi " + sport);
            }
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox2.Checked)
            {
                textBox.Enabled = true;
            }
            else
            {
                textBox.Enabled = false;
            }
        }
    }
}
