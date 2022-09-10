
namespace Exercise2
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.boxXemphim = new System.Windows.Forms.CheckBox();
            this.checkBox2 = new System.Windows.Forms.CheckBox();
            this.label2 = new System.Windows.Forms.Label();
            this.label3 = new System.Windows.Forms.Label();
            this.button1 = new System.Windows.Forms.Button();
            this.btnR1 = new System.Windows.Forms.RadioButton();
            this.btnR2 = new System.Windows.Forms.RadioButton();
            this.comboBox1 = new System.Windows.Forms.ComboBox();
            this.timePicker = new System.Windows.Forms.DateTimePicker();
            this.textBox = new System.Windows.Forms.TextBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(12, 27);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(101, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Sở thích của bạn là";
            // 
            // boxXemphim
            // 
            this.boxXemphim.AutoSize = true;
            this.boxXemphim.Location = new System.Drawing.Point(15, 58);
            this.boxXemphim.Name = "boxXemphim";
            this.boxXemphim.Size = new System.Drawing.Size(72, 17);
            this.boxXemphim.TabIndex = 1;
            this.boxXemphim.Text = "Xem phim";
            this.boxXemphim.UseVisualStyleBackColor = true;
            this.boxXemphim.CheckedChanged += new System.EventHandler(this.boxXemphim_CheckedChanged);
            // 
            // checkBox2
            // 
            this.checkBox2.AutoSize = true;
            this.checkBox2.Checked = true;
            this.checkBox2.CheckState = System.Windows.Forms.CheckState.Checked;
            this.checkBox2.Location = new System.Drawing.Point(15, 95);
            this.checkBox2.Name = "checkBox2";
            this.checkBox2.Size = new System.Drawing.Size(69, 17);
            this.checkBox2.TabIndex = 2;
            this.checkBox2.Text = "Thể thao";
            this.checkBox2.UseVisualStyleBackColor = true;
            this.checkBox2.CheckedChanged += new System.EventHandler(this.checkBox2_CheckedChanged);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(12, 134);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(46, 13);
            this.label2.TabIndex = 3;
            this.label2.Text = "Bạn là...";
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(12, 170);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(54, 13);
            this.label3.TabIndex = 4;
            this.label3.Text = "Ngày sinh";
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(175, 217);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(93, 23);
            this.button1.TabIndex = 5;
            this.button1.Text = "Lưu thông tin";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // btnR1
            // 
            this.btnR1.AutoSize = true;
            this.btnR1.Checked = true;
            this.btnR1.Location = new System.Drawing.Point(77, 134);
            this.btnR1.Name = "btnR1";
            this.btnR1.Size = new System.Drawing.Size(47, 17);
            this.btnR1.TabIndex = 6;
            this.btnR1.TabStop = true;
            this.btnR1.Text = "Nam";
            this.btnR1.UseVisualStyleBackColor = true;
            // 
            // btnR2
            // 
            this.btnR2.AutoSize = true;
            this.btnR2.Location = new System.Drawing.Point(153, 134);
            this.btnR2.Name = "btnR2";
            this.btnR2.Size = new System.Drawing.Size(39, 17);
            this.btnR2.TabIndex = 7;
            this.btnR2.Text = "Nữ";
            this.btnR2.UseVisualStyleBackColor = true;
            // 
            // comboBox1
            // 
            this.comboBox1.Enabled = false;
            this.comboBox1.FormattingEnabled = true;
            this.comboBox1.Items.AddRange(new object[] {
            "Hành động",
            "Giải trí",
            "Tình cảm",
            "Chính kịch"});
            this.comboBox1.Location = new System.Drawing.Point(105, 56);
            this.comboBox1.Name = "comboBox1";
            this.comboBox1.Size = new System.Drawing.Size(167, 21);
            this.comboBox1.TabIndex = 8;
            this.comboBox1.Text = "Thể loại yêu thích";
            // 
            // timePicker
            // 
            this.timePicker.Location = new System.Drawing.Point(72, 164);
            this.timePicker.Name = "timePicker";
            this.timePicker.Size = new System.Drawing.Size(200, 20);
            this.timePicker.TabIndex = 9;
            // 
            // textBox
            // 
            this.textBox.Location = new System.Drawing.Point(105, 95);
            this.textBox.Name = "textBox";
            this.textBox.Size = new System.Drawing.Size(167, 20);
            this.textBox.TabIndex = 10;
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(279, 251);
            this.Controls.Add(this.textBox);
            this.Controls.Add(this.timePicker);
            this.Controls.Add(this.comboBox1);
            this.Controls.Add(this.btnR2);
            this.Controls.Add(this.btnR1);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.label3);
            this.Controls.Add(this.label2);
            this.Controls.Add(this.checkBox2);
            this.Controls.Add(this.boxXemphim);
            this.Controls.Add(this.label1);
            this.MaximumSize = new System.Drawing.Size(295, 290);
            this.MinimumSize = new System.Drawing.Size(295, 290);
            this.Name = "Form1";
            this.StartPosition = System.Windows.Forms.FormStartPosition.CenterScreen;
            this.Text = "Form1";
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.CheckBox boxXemphim;
        private System.Windows.Forms.CheckBox checkBox2;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.RadioButton btnR1;
        private System.Windows.Forms.RadioButton btnR2;
        private System.Windows.Forms.ComboBox comboBox1;
        private System.Windows.Forms.DateTimePicker timePicker;
        private System.Windows.Forms.TextBox textBox;
    }
}

