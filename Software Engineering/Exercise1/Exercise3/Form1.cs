using System;
using System.Collections;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exercise3
{
    public partial class Enter : Form
    {
        String name;
        DateTime date;
        String gender;
        String bornIn;
        int id = 0;
        private ArrayList list = new ArrayList();
        public Enter()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            checkBox1.Checked = true;
        }

        private void btnAdd_Click(object sender, EventArgs e)
        {
            if (txtName.Text.Length < 8)
            {
                MessageBox.Show("Please enter your full name.");
                txtName.Focus();
                return;
            }
            else
            {
                name = txtName.Text;
            }

            int currentYear = DateTime.Now.Year;
            int age = currentYear - dateTimePicker.Value.Year;
            if(age < 17 || age > 31)
            {
                MessageBox.Show("Student age must be from 18 to 30.");
                return;
            }
            else
            {
                date = dateTimePicker.Value;
            }

            if(txtBornIn.Text.Length == 0)
            {
                MessageBox.Show("Please enter your place where you born in.");
                txtBornIn.Focus();
                return;
            }
            else
            {
                bornIn = txtBornIn.Text;
            }
            list.Add(new Student(id, name, date, gender, bornIn));

            Link.Text = ++id + " student(s) added";
        }

        private void checkBox1_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox1.Checked)
            {
                gender = "Nam";
                checkBox2.Checked = false;
            }
        }

        private void checkBox2_CheckedChanged(object sender, EventArgs e)
        {
            if (checkBox2.Checked)
            {
                gender = "Nữ";
                checkBox1.Checked = false;
            }
        }

        private void btnReset_Click(object sender, EventArgs e)
        {
            txtName.Text = "";
            txtBornIn.Text = "";
            dateTimePicker.Value = DateTime.Now;
            checkBox1.Checked = true;
        }

        private void Link_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {

            Form2 form = new Form2(list);
            form.Show();
            Link.LinkVisited = true;
        }
    }

    class Student
    {
        public Student(int id, string name, DateTime date, string gender, string bornIn)
        {
            this.id = id;
            this.name = name;
            this.date = date;
            this.gender = gender;
            this.bornIn = bornIn;
        }
        public int id { get; set; }
        public String name { get; set; }
        public DateTime date { get; set; }
        public String gender { get; set; }
        public String bornIn { get; set; }
    }
}
