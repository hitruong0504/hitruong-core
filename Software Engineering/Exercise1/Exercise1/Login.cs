using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exercise1
{
    public partial class Login : Form
    {
        public Login()
        {
            InitializeComponent();
        }

        private void Login_Load(object sender, EventArgs e)
        {
            btnLogin.Enabled = false;
        }

        private void txtUsername_TextChanged(object sender, EventArgs e)
        {
            btnLogin.Enabled = (txtUsername.Text.Length >= 1);
        }

        private void btnLogin_Click(object sender, EventArgs e)
        {
            String username = txtUsername.Text;
            String password = txtPassword.Text;

           if(username.Length == 0)
            {
                MessageBox.Show("Please enter the user name!!!");
            }
            else if (password.Length == 0)
            {
                MessageBox.Show("Please enter your password!!!");
            }
            else if (password.Length < 6)
            {
                MessageBox.Show("Password must have at least 6 characters");
            }
            else
            {
                MessageBox.Show("Welcome " + username + "! Login successful");
            }
        }

        private void btnReset_Click(object sender, EventArgs e)
        {
            txtUsername.Text = "";
            txtPassword.Text = "";
        }
    }
}
