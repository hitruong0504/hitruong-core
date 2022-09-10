using System;
using System.IO;
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
    public partial class Form2 : Form
    {
        ArrayList myList = new ArrayList();
        public Form2()
        {
            InitializeComponent();
        }

        public Form2(ArrayList list)
        {
            myList = list;
            InitializeComponent();
        }

        private void chooseStudents_SelectedIndexChanged(object sender, EventArgs e)
        {
            foreach (Student student in myList)
            {
                if(chooseStudents.SelectedIndex == student.id)
                {
                    lbName.Enabled = true;
                    lbBirth.Enabled = true;
                    lbGender.Enabled = true;
                    lbBI.Enabled = true;

                    lbName.Text = student.name;
                    lbBirth.Text = student.date.ToString();
                    lbGender.Text = student.gender;
                    lbBI.Text = student.bornIn;
                }
            }
        }

        private void Form2_Load(object sender, EventArgs e)
        {
            Size = new Size(345, 280);
            this.load();
            lbName.Enabled = false;
            lbBirth.Enabled = false;
            lbGender.Enabled = false;
            lbBI.Enabled = false;
        }

        private void btnE_Click(object sender, EventArgs e)
        {
            if(myList.Count == 0)
            {
                MessageBox.Show("List is empty!!!");
            }
            var csv = new StreamWriter("..\\..\\..\\data.csv");
            var line = string.Format("{0}, {1}, {2}, {3}, {4}", "id", "name", "birth", "gender", "born in");
            csv.WriteLine(line);

            foreach (Student student in myList)
            {
                var first = student.id.ToString();
                var second = student.name.ToString();
                var third = student.date.ToString();
                var fourth = student.gender;
                var fifth = student.bornIn;

                var newline = string.Format("{0}, {1}, {2}, {3}, {4}", first, second, third, fourth, fifth);
                csv.WriteLine(newline);

                csv.Flush();

            }
            MessageBox.Show("Export success.");
        }

        private void btnI_Click(object sender, EventArgs e)
        {
            Size = new Size(345, 370);
        }

        private void btnImport_Click(object sender, EventArgs e)
        {
            if (txtPath.Text.Length == 0)
            {
                MessageBox.Show("Please enter the path!!!");
                txtPath.Focus();
                return;
            }

            try
            {
                string fullText;
                using(StreamReader sr = new StreamReader(txtPath.Text))
                {
                    txtPath.Text = "";
                    sr.ReadLine();
                    ArrayList newList = new ArrayList();
                    while (!sr.EndOfStream)
                    {
                        fullText = sr.ReadLine();
                        String[] full = fullText.Split(',');
                        newList.Add(new Student(int.Parse(full[0].Trim()), full[1].Trim(), DateTime.Parse(full[2].Trim()), full[3].Trim(), full[4].Trim()));
                    }
                    myList.Clear();
                    myList = newList;
                    this.load();
                    MessageBox.Show("Import Success");
                }

            }
            catch (Exception ex)
            {
                MessageBox.Show("Exception " + ex);
            }

        }

        private void load()
        {
            foreach (Student student in myList)
            {
                chooseStudents.Items.Add(student.name);
            }
        }
    }


}
