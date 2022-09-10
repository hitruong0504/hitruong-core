using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Net;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Exercise4
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if(txtURL.Text.Length == 0)
            {
                MessageBox.Show("Please enter the url!!!");
                txtURL.Focus();
                return;
            }


            String url = txtURL.Text;
            String[] temp = url.Split('/');
            String FileName = "..\\..\\..\\" + temp[temp.Length - 1];
            Uri uri;
            bool result = Uri.TryCreate(url, UriKind.Absolute, out uri) && (uri.Scheme == Uri.UriSchemeHttp || uri.Scheme == Uri.UriSchemeHttps);

            if (result)
            {
                int process = 0;
                var client = new WebClient();
                client.DownloadFile(url, FileName);
                lbDownload.Text = ++process + " download(s) in process.";
                richtb.Text += temp[temp.Length - 1] + "\n";
                txtURL.Text = "";
            }
            else
            {
                MessageBox.Show("Url is invalid!!!");
            }
        }
    }
}
